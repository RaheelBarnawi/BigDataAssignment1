import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
// design and  implement  the Mapper Class
public class MapperFirend extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	public void map(Object key, Text value, Context context
			) throws IOException, InterruptedException {
		
		
	}
}
