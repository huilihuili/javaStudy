package top.leagle.thinking.chpter20.dbtable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

	private static String getConstraints(Constraints con) {
		String constraints = "";

		if (!con.allowNull()) {
			constraints += " NOT NULL";
		}
		if (con.primaryKey()) {
			constraints += " PRIMARY KEY";
		}
		if (con.unique()) {
			constraints += " UNIQUE";
		}

		return constraints;
	}

	public static String createTableSql(Class<?> cl) {
		DBTable dbTable = cl.getAnnotation(DBTable.class);
		if (dbTable == null) {
			System.out.println("No DBTable annotations in class " + cl.getSimpleName());
			return null;
		}

		String tableName = dbTable.name();
		if (tableName.length() < 1) {
			tableName = cl.getSimpleName().toUpperCase();
		}

		List<String> columnDefs = new ArrayList<>();
		for (Field field : cl.getDeclaredFields()) {
			String columnName = null;
			Annotation[] annotations = field.getDeclaredAnnotations();
			if (annotations.length < 1) {
				continue;
			}

			if (annotations[0] instanceof SQLInteger) {
				SQLInteger sqlInteger = (SQLInteger) annotations[0];
				if (sqlInteger.name().length() < 1) {
					columnName = field.getName().toUpperCase();
				} else {
					columnName = sqlInteger.name();
				}
				columnDefs.add(columnName + " INT" + getConstraints(sqlInteger.constraints()));
			}

			if (annotations[0] instanceof SQLString) {
				SQLString sqlString = (SQLString) annotations[0];
				if (sqlString.name().length() < 1) {
					columnName = field.getName().toUpperCase();
				} else {
					columnName = sqlString.name();
				}
				columnDefs.add(
						columnName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constraints()));
			}
		}

		StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
		for (String columnDef : columnDefs) {
			createCommand.append("\n    " + columnDef + ",");
		}
		String tableCreate = createCommand.substring(0, createCommand.length() - 1) + "\n);";
		return tableCreate;
	}

	public static void main(String[] args) {
		System.out.println(createTableSql(Member.class));
	}
}
