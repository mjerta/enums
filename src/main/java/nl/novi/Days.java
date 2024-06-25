package nl.novi;

public enum Days {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WENESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY;

  public Days next() {
    switch (this) {
      case SUNDAY:
        return MONDAY;
      case MONDAY:
        return TUESDAY;
      case TUESDAY:
        return WENESDAY;
      case WENESDAY:
        return THURSDAY;
      case THURSDAY:
        return FRIDAY;
      case FRIDAY:
        return SATURDAY;
      default:
        return SUNDAY;

    }
  }

  public Days nextWorkDay() {
    switch (this) {
      case SUNDAY:
        return MONDAY;
      case MONDAY:
        return TUESDAY;
      case TUESDAY:
        return WENESDAY;
      case WENESDAY:
        return THURSDAY;
      case THURSDAY:
        return FRIDAY;
      default:
        return MONDAY;

    }
  }




}