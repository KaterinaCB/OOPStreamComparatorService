import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(), 1);
        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(), 2);
        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(), 3);
        Stream stream = new Stream("stream", new ArrayList<>());
        stream.addStudentGroup(studentGroup1);
        stream.addStudentGroup(studentGroup2);
        stream.addStudentGroup(studentGroup3);
        Stream stream1 = new Stream("stream1", new ArrayList<>());
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);
        StreamService streamService = new StreamService(Arrays.asList(stream, stream1));
        for(Stream streamSorted: streamService.getSortedStreamBySize()){
            System.out.println(streamSorted);
        }

    }
}