package com.guanguan.common;

abstract class Link {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract void setNumber(int number, AbstractMediator am);
}

class LinkA extends Link {
	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}
}

class LinkB extends Link {
	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}

abstract class AbstractMediator {
	protected Link A;
	protected Link B;

	public AbstractMediator(Link a, Link b) {
		A = a;
		B = b;
	}
	public abstract void AaffectB();
	public abstract void BaffectA();
}
//A、B是两个数，更改任意一个都会使另一个数发生改变，用中介者模式实现这一过程，请构造Mediator类，作为数A和数B的中介者
//No.1
//开始写代码，结合代码，在这里写出实现问题的代码
class Mediator extends AbstractMediator {
	  private Link link;  
	   private Link link2; 
	public Mediator(Link a, Link b) {
		super(a, b);
		// TODO Auto-generated constructor stub
		this.link=a;
		this.link2=b;
	}

	@Override
	public void AaffectB() {
		// TODO Auto-generated method stub
		link.setNumber(link.getNumber());
		link2.setNumber(link.getNumber()+20);
	}

	@Override
	public void BaffectA() {
		// TODO Auto-generated method stub
		link2.setNumber(link.getNumber());
		link.setNumber(link.getNumber()/10);
	}




}
//end_code
public class MediatorTest {
	public static void main(String[] args) {
		Link linkA = new LinkA();
		Link linkB = new LinkB();
	
		AbstractMediator am = new Mediator(linkA, linkB);

		System.out.println("通过设置A影响B");
		linkA.setNumber(20, am);
		System.out.println("A的值为：" + linkA.getNumber());
		System.out.println("B的值为A的10倍：" + linkB.getNumber());

		System.out.println("通过设置B影响A");
		linkB.setNumber(200, am);
		System.out.println("B的值为：" + linkB.getNumber());
		System.out.println("A的值为B的0.1倍：" + linkA.getNumber());
	}
}