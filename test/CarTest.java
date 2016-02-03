import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Pink", 100);
		car1.accelerate(100);
		assertThat(car1.toString(), is("Color: Pink, Speed: 100"));
	}


	@Test
	public void decelerationTest(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		car1.decelerate(50);
		assertThat(car1.getSpeed(), is(50));
	}
	@Test
	public void cannotDecelerateBelowZero(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(105);
		car1.decelerate(106);
		assertThat(car1.getSpeed(), is(0));
	}
	
}
