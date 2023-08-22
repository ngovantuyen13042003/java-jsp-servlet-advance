package st.nvt.controller;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import st.nvt.model.GraduateModel;
import st.nvt.model.MajorModel;
import st.nvt.model.SchoolModel;
import st.nvt.model.StudentModel;
import st.nvt.service.IGradauteService;
import st.nvt.service.IMajorService;
import st.nvt.service.ISchoolService;
import st.nvt.service.IStudentService;
import st.nvt.service.impl.GraduateService;
import st.nvt.service.impl.MajorService;
import st.nvt.service.impl.SchoolService;
import st.nvt.service.impl.StudentService;
import st.nvt.utils.FormUtil;


@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		IMajorService major = new MajorService();
		ISchoolService school = new SchoolService();
		
		List<MajorModel> majorList = major.findAll();
		List<SchoolModel> schoolList = school.findAll();
		
		request.setAttribute("schoolList", schoolList);
		request.setAttribute("majorList", majorList);

		RequestDispatcher rd = request.getRequestDispatcher("/view/Student.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		StudentModel studentModel = FormUtil.toModel(StudentModel.class, request);
		GraduateModel graduateModel = FormUtil.toModel(GraduateModel.class, request);
		String notifyError = "";
		String url = "";
		DateFormat formart = new SimpleDateFormat("yyyy-dd-mm");
		String  dateGraduate =  request.getParameter("graduateDate");
		try {
			if(checkGraduateDate((Date) formart.parse(dateGraduate)) < 0) {
				notifyError = "Date graduate incorrect";
				url = "/view/Student.jsp";
			}
			else {
				IGradauteService graduateService = new GraduateService();
				IStudentService studentService = new StudentService();
				
				if(studentService.insert(studentModel) == true && graduateService.insert(graduateModel) == true) {
					notifyError = "Success!";
				}else {
					notifyError = "Failure!";
				}
				url = "/view/Student.jsp";
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("notifyError", notifyError);

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	
	public long checkGraduateDate(Date date) {
		Calendar dateGraduate = new GregorianCalendar();
		dateGraduate.setTime(date);
		Calendar ngayHienTai = new GregorianCalendar();
		ngayHienTai.setTime(Calendar.getInstance().getTime());
		return  (ngayHienTai.getTime().getTime() - dateGraduate.getTime().getTime()) / (24 * 3600 * 1000);
	}

	

}

















