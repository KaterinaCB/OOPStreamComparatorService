import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }

    public void removeStudent(Student student){
        for(Student studentItem : students){
            if(student.equals(studentItem)){
                students.remove(studentItem);
            }
        }
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> students1 = new ArrayList<>(students.getStudents());
        Collections.sort(students1);
        return students1;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(students.getStudents());
        studentList.sort(new StudentCroupComparator());
        return studentList;
    }
}
