package st.nvt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import st.nvt.model.StudentModel;
import st.nvt.service.IStudentService;
import st.nvt.service.impl.StudentService;

@WebServlet("/search-student-job-graduate")
public class SearchJobStudentAfterGraduate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SearchJobStudentAfterGraduate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchContent = request.getParameter("searchContent");

		IStudentService studentService = new StudentService();
		List<StudentModel> resultSearch = studentService.searchJobStudent(searchContent);

		request.setAttribute("resultSearch", resultSearch);

		RequestDispatcher rd = request.getRequestDispatcher("/view/SearchJobStudentAfterGraduate.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
