package Airport;

public abstract class Human {
    protected String name;
    protected String surname;
    // protected - модификатор доступа, который дает доступ к полю класса всем классам,
    // которые его наследуют или находятся с ним в одном package.
    // public  - доступ к полю класса имеют все классы в данном проекте.
    // private -  доступ к полю класса только в пределах этого класса.
    // static  - выносит поле класса в отдельную область видимости( получить доступ к полю класса можно через точку,
    // не создавая объектный экземпляр класса.)Human.age вместо ...new Human

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human (){

        this. name = "";
        this.surname = "";
    }


    public void setName(String newName) {name = newName;}
    public String getName(){ return name;}
    public void setSurname(String newSurname){surname = newSurname;}
    public String getSurname(){ return surname;}

}

