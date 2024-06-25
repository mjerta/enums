package nl.novi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaysTest {

  @Test
  public void canRunNext() {
    // arrange

    // act

    // assert
    assertEquals(Days.MONDAY, Days.SUNDAY.next());

  }


  @Test
  public void canRunNextWorkDay() {
    // arrange

    // act

    // assert
    assertEquals(Days.MONDAY, Days.SUNDAY.nextWorkDay());

  }

}
