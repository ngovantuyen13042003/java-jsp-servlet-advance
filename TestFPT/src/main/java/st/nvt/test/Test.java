package st.nvt.test;

import java.util.List;

import st.nvt.model.StudentModel;
import st.nvt.service.IStudentService;
import st.nvt.service.impl.StudentService;

public class Test {
	public static void main(String[] args){
//		IMajorService iMajor = new MajorService();
//		List<MajorModel> list = iMajor.findAll();
//		for (MajorModel majorModel : list) {
//			System.out.println(majorModel);
//		}
//		
//		
//		System.out.println(iMajor.findOne("M02"));
//		
//		
//		
//		
//		System.out.println("=======================");
//		
//		ISchoolService schoolService = new SchoolService();
//		List<SchoolModel> l = schoolService.findAll();
//		for (SchoolModel schoolModel : l) {
//			System.out.println(l);
//		}
		
//		SchoolModel school = new SchoolModel();
//		school.setAddress("Ngũ Hàng Sơn");
//		school.setIdSchool("S05");
//		school.setName("Đại học kinh tế");
//		school.setPhoneNumber("0216361261");
//		
//		ISchoolService service = new SchoolService()
//				;
//		String id = service.insert(school);
//		
//		GraduateModel graduate = new GraduateModel();
//		graduate.setIdSchool("S05");
//		graduate.setIdentityCardNumber("123456789");
//		graduate.setIdMajor("M02");
//		graduate.setGraduateType("5246461616");
//		graduate.setGraduateDegree("Giỏi");
//		graduate.setGraduateDegree("kỹ sư ");
//
//		String dateString = "13/04/2003";
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		java.util.Date parsedDate = null;
//		try {
//		    parsedDate = dateFormat.parse(dateString);
//		} catch (ParseException e) {
//		    e.printStackTrace();
//		}
//
//		Timestamp timestamp = new Timestamp(parsedDate.getTime());
//		graduate.setGraduateDate(timestamp);
//
//		IGradauteService service = new GraduateService();
//		System.out.println(service.insert(graduate));

//		IStudentService service = new StudentService();
//		StudentModel student = new StudentModel();
//		student.setAddress("Quảng Trị");
//		student.setEmail("tuyenngo.edu2gmail.com");
//		student.setIdentityCardNumber("987654321");
//		student.setName("Ngô Văn Hửu");
//		student.setPhoneNumber("01464616558");
//		
//		
//		service.insert(student);
		
		
		IStudentService service = new StudentService();
		List<StudentModel> list = service.searchJobStudent("Ngô");
		System.out.println("result search");
		for (StudentModel studentModel : list) {
			System.out.println(studentModel);
		}
		
		
	}
}

































