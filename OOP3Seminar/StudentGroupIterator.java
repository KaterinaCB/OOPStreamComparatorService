import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> students;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter <= students.size() - 1;
    }

    @Override
    public Student next() {
        if(hasNext()){
            return students.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        students.remove(counter);
    }
}
