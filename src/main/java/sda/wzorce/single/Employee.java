package sda.wzorce.single;

class Employee
{
    private String email;
    private int salary;
    private int salaryThreshold = 2500;
    private String name;
    private String surname;

    public Employee (String name, String surname, String email, int salary)
    {
        this.salary = salary;
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
        if(!validateEmail().equals("")) {
            this.email = "";
        }
    }

    private String validateEmail ()
    {
        String message = "";
        if (message == null  || "".equals(email)) {
            message += "brak emaila, ";
        }
        if (!email.contains("@")) {
            message += "niepoprawny email, ";
        }

        return message;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getSalaryThreshold() {
        return salaryThreshold;
    }

    public void setSalaryThreshold(int salaryThreshold) {
        this.salaryThreshold = salaryThreshold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}