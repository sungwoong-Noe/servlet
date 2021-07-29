package hello.servlet.basic.requeset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String method = request.getMethod();    //http 메서드 getPOST 정보
//        request.getProtocol();  //http 1.1이다는 정보
        printStartLine(request);


    }

    private void printStartLine(HttpServletRequest request) {
        System.out.println("--- REQUEST-LINE - start ---");
        System.out.println("request.getMethod() = " + request.getMethod());     //GET
        System.out.println("request.getProtocal() = " + request.getProtocol());     //HTTP/1.1
        System.out.println("request.getScheme() = " + request.getScheme());     //http// http://localhost:8080/request-header
        System.out.println("request.getRequestURL() = " + request.getRequestURL()); //request-test
        System.out.println("request.getRequestURI() = " + request.getRequestURI()); //username=hi
        System.out.println("request.getQueryString() = " + request.getQueryString());   //쿼리 파라미터
        System.out.println("request.isSecure() = " + request.isSecure()); //https사용 유무
        System.out.println("--- REQUEST-LINE - end ---");
        System.out.println();
    }

    //Header 모든 정보
    private void printHeaders(HttpServletRequest request) {
        System.out.println("--- Headers - start ---");
    /*  예전방식
     Enumeration<String> headerNames = request.getHeaderNames();
     while (headerNames.hasMoreElements()) {
        String headerName = headerNames.nextElement();
        System.out.println(headerName + ": " + request.getHeader(headerName));
     }
    */

    }


}
