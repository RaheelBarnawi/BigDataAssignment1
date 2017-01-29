import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
// design and  implement  the Mapper Class
public class MapperFirend extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	//private final static IntWritable one = new IntWritable(1);
	//private Text word = new Text();
	IntWritable friend1 = new IntWritable();
	IntWritable friend2 = new IntWritable();
	
	
	public void map(Object key, Text value, Context context
			) throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString());
		List frinedList= new ArrayList();
		while (itr.hasMoreTokens()) 
		{
			
		}
		
		
	}
}
