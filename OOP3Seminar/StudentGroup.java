import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private final int studentGroupId;
    private List<Student> students;
    public StudentGroup(List<Student> students, int studentGroupId){
        this.students = students;
        this.studentGroupId = studentGroupId;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    public void remove(Student student){
        students.remove(student);
    }
}
