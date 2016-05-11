package com.kc.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadAction extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		FileItemFactory fif = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(fif);
		List<FileItem> fi = null;
		try {
			fi = sfu.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

		File f = new File("F:\\gw\\a.jpg");
		for (FileItem fileItem : fi) {
			try {
				fileItem.write(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
