package homework8.human;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by Viktor on 12.06.2015.
 */
public class Human implements Serializable,Cloneable{
     String Name;
     int Age;
     Sex  sex;

    public Human(String Name, int Age, Sex sex){
        this.Name = Name;
        this.Age = Age;
        this.sex = sex;
    }

public enum Sex{MALE,FEMALE};

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (!Name.equals(human.Name)) return false;
        if (!(Age ==human.Age)) return false;
        if (!(sex ==human.sex)) return false;
return Name.equals(human.Name);
    }

    @Override
    public int hashCode() {
        int result = Name.hashCode();

        result = 31 * result + Age;
      //  result = 31 * result + sex.hashCode();
        return  result;
    }

    @Override
    public String toString() {
        return Name + ' ' + ", age " + Age + ", sex " + sex;
    }
}
