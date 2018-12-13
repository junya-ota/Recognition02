package recognition02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyOptions;


public class Recognition02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recognition02_lib rlib = new Recognition02_lib();

		rlib.getResult("img/4904810102052.jpg");
	}

}
