package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	public static final String folderPath =  "D://img//";
	  public static final Path filePath = Paths.get(folderPath);
	  
	  @Autowired
		private CustomerServiceImpl service;
		
		@PostMapping(value="/", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	    public ResponseEntity<Object> uploadFiles(@RequestPart Customer cust,@RequestParam("files") MultipartFile[] files) {
	        try {
	            createDirIfNotExist();

	            List<String> fileNames = new ArrayList<>();

	            // read and write the file to the local folder
	            Arrays.asList(files).stream().forEach(file -> {
	                byte[] bytes = new byte[0];
	                try {
	                    bytes = file.getBytes();
	                    Path path=Paths.get(folderPath + file.getOriginalFilename());
	                    Files.write(path, bytes);
	                    fileNames.add(path.toString());
	                } catch (IOException e) {
	                	e.printStackTrace();
	                }
	            });
	            cust.setPhoto(fileNames.get(0));
	            service.addCustomer(cust);
	            return ResponseEntity.status(HttpStatus.OK).body("Files uploaded successfully: " + fileNames);

	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Exception to upload files!");
	        }
	    }

	    /**
	     * Create directory to save files, if not exist
	     */
	    private void createDirIfNotExist() {
	        //create directory to save the files
	        File directory = new File(folderPath);
	        if (! directory.exists()){
	            directory.mkdir();
	        }
	    }
	    /**
	     * Method to get the list of files from the file storage folder.
	     * @return file
	     */
	    @GetMapping("/files")
	    public ResponseEntity<String[]> getListFiles() {
	        return ResponseEntity.status(HttpStatus.OK)
	                .body( new File(folderPath).list());
	    } @GetMapping("/")
	    public List<Customer> getAllCss(){
			return service.getAll();
		}
		 
	}