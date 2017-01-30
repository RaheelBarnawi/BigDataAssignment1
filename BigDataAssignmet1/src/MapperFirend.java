import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
// design and  implement  the Mapper Class
public class MapperFirend extends Mapper<LongWritable, Text, IntWritable, IntWritable>{
	
	//private final static IntWritable one = new IntWritable(1);
	//private Text word = new Text();
	
	
	
	public void map(Object key, Text value, Context context
			) throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString());
		IntWritable friend1 = new IntWritable();
		IntWritable friend2 = new IntWritable();
		ArrayList<Integer> frinedList= new ArrayList<>();
		itr.nextToken();
		while (itr.hasMoreTokens()) 
		{
			frinedList.add(Integer.parseInt(itr.nextToken()));
			
		}
		
		for( int i=0; i<frinedList.size(); i++)
		{
			friend1.set(frinedList.get(i));
			for (int j=0; j<frinedList.size(); j++)
			{
				if(frinedList.get(i) != frinedList.get(j))
				{
					friend2.set(frinedList.get(j));
					
					context.write(friend1, friend2);
				}
					
					
			}
		}
	}
}
