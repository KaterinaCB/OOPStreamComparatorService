import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private String streamName;
    private List<StudentGroup> studentGroupList;
    private int counter;

    public Stream(String streamName, List<StudentGroup> studentGroupsList) {
        this.streamName = streamName;
        this.studentGroupList = studentGroupsList;
        counter = 0;
    }

    public List<StudentGroup> getStudentGroupsList() {
        return studentGroupList;
    }

    public void setStudentGroupsList(List<StudentGroup> studentGroupsList) {
        this.studentGroupList = studentGroupsList;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamName='" + streamName + '\'' +
                ", size=" + studentGroupList.size() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stream o) {
        if(studentGroupList.size() > o.size()){
            return 1;
        }
        if(studentGroupList.size() < o.size()) {
            return -1;
        }
        return 0;
    }

    int size(){
        return studentGroupList.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                return counter < studentGroupList.size();
            }

            @Override
            public StudentGroup next() {
                return studentGroupList.get(counter++);
            }
        };
    }
}
