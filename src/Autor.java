public class Autor {              // TASK 19
    private String surname;
    private String nationality;

    public Autor (String surname, String nationality) {
        this.surname=surname;
        this.nationality=nationality;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}