import java.util.Scanner;
public class Lecture2_Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid day:");
        int day = sc.nextInt();
        if (day < 1) {
            System.out.println("Invalid entry, restart me!");
            return;
        }
        System.out.println("Please enter a valid month:");
        int month = sc.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Invalid entry, restart me!");
            return;
        }
        System.out.println("Please enter a valid year:");
        int year = sc.nextInt();
        if (year < 1) {
            System.out.println("Invalid entry! I calculate only after the birth of Jesus.");
            return;
        }

        // Working w/ leap years

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    //LEAP YEAR that is a CENTURY, but Divisible by 400
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                        if (day > 31) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 31) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 2) {
                        if (day > 29) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 29) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day > 30) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 30) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 12) {
                        if (day > 31) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 31) {
                            System.out.println("The next day is: 1/1/" + (year + 1));
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                } else {
                    // NOT LEAP YEAR --- it is a century
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                        if (day > 31) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 31) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 2) {
                        if (day > 28) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 28) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day > 30) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 30) {
                            System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                    if (month == 12) {
                        if (day > 31) {
                            System.out.println("Invalid entry, restart me!");
                            return;
                        }
                        if (day == 31) {
                            System.out.println("The next day is: 1/1/" + (year + 1));
                        } else {
                            System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                        }
                    }
                }

            } else {
                // LEAP YEAR that is not a century
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                    if (day > 31) {
                        System.out.println("Invalid entry, restart me!");
                        return;
                    }
                    if (day == 31) {
                        System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                    } else {
                        System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                    }
                }
                if (month == 2) {
                    if (day > 29) {
                        System.out.println("Invalid entry, restart me!");
                        return;
                    }
                    if (day == 29) {
                        System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                    } else {
                        System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                    }
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        System.out.println("Invalid entry, restart me!");
                        return;
                    }
                    if (day == 30) {
                        System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                    } else {
                        System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                    }
                }
                if (month == 12) {
                    if (day > 31) {
                        System.out.println("Invalid entry, restart me!");
                        return;
                    }
                    if (day == 31) {
                        System.out.println("The next day is: 1/1/" + (year + 1));
                    } else {
                        System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                    }
                }

            }

        } else {
            // NOT LEAP YEAR
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                if (day > 31) {
                    System.out.println("Invalid entry, restart me!");
                    return;
                }
                if (day == 31) {
                    System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                } else {
                    System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                }
            }
            if (month == 2) {
                if (day > 28) {
                    System.out.println("Invalid entry, restart me!");
                    return;
                }
                if (day == 28) {
                    System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                } else {
                    System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                }
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    System.out.println("Invalid entry, restart me!");
                    return;
                }
                if (day == 30) {
                    System.out.println("The next day is: 1/" + (month + 1) + "/" + year);
                } else {
                    System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                }
            }
            if (month == 12) {
                if (day > 31) {
                    System.out.println("Invalid entry, restart me!");
                    return;
                }
                if (day == 31) {
                    System.out.println("The next day is: 1/1/" + (year + 1));
                } else {
                    System.out.println("The next day is: " + (day + 1) + "/" + month + "/" + year);
                }
            }

        }
    }
}

