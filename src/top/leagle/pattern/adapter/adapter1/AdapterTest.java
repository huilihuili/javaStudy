package top.leagle.pattern.adapter.adapter1;

import org.junit.Test;

import top.leagle.pattern.adapter.adapter1.adapter.DuckAdapter;
import top.leagle.pattern.adapter.adapter1.adapter.TurkeyAdapter;
import top.leagle.pattern.adapter.adapter1.duck.Duck;
import top.leagle.pattern.adapter.adapter1.duck.sub.MallardDuck;
import top.leagle.pattern.adapter.adapter1.turkey.Turkey;
import top.leagle.pattern.adapter.adapter1.turkey.sub.WildTurkey;

public class AdapterTest {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duck duckAdapter = new DuckAdapter(turkey);
		duckAdapter.quack();
		duckAdapter.fly();
	}

	@Test
	public void test1() {
		Duck duck = new MallardDuck();
		Turkey turkeyAdapter = new TurkeyAdapter(duck);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}

	@Test
	public void test2() {
		Turkey turkey = new WildTurkey();
		Duck duckAdapter = new DuckAdapter(turkey);
		duckAdapter.quack();
		duckAdapter.fly();
	}
}
