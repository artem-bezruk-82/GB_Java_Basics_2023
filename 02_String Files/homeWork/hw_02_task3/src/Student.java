public class Student
{
    private String surname;
    private String subject;
    private Integer score;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString()
    {
        return String.format("Студент %s получил %d по предмету %s", this.surname, this.score, this.subject);
    }

}
