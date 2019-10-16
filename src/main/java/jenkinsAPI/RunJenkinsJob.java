package jenkinsAPI;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

public class RunJenkinsJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JenkinsServer jenkins = new JenkinsServer(new URI("http://localhost:8080"), "admin",
					"11655031df9034c4a9dec7cf5d57447a38");
			Map<String, Job> jobs = jenkins.getJobs();
			JobWithDetails job = jobs.get("TestFailure").details();
			System.out.println(job);
			job.build();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
