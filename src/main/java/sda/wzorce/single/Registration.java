package sda.wzorce.single;

class Registration {

    private String login;
    private String password;

    public Registration(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean validateLogin() {

       // echo 'Walidacja loginu';
        return true;
    }


    public void  saveUserToDatabase() {

       //  'Zapisywanie nowego użytkownika do bazy danych';

    }

    public static void main(String[] args) {


        Registration newRegistration = new Registration("Donald", "Miller");

        newRegistration.validateLogin();

        newRegistration.saveUserToDatabase();
    }

}