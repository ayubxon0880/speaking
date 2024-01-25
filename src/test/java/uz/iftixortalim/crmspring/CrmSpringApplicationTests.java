package uz.iftixortalim.crmspring;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import uz.iftixortalim.crmspring.dto.response.ResponseFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootTest
class CrmSpringApplicationTests {

    /*@Test
    void contextLoads() {
        Path path = Paths.get("file.txt");
		String name = "file.txt";
		String originalFileName = "file.txt";
		String contentType = "text/plain";
		byte[] content = null;
		try {
			content = Files.readAllBytes(path);
		} catch (final IOException e) {
		}
		MultipartFile file = new MockMultipartFile(name,
				originalFileName, contentType, content);

        String apiUrl = "https://api.bytescale.com/v2/accounts/FW25bs8/uploads/form_data";

        WebClient webClient = WebClient.create();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.set("Authorization", "Bearer secret_FW25bs889d2QWwK9NwqCV5Gpc8MG");

        byte[] fileContent;
        try {
            fileContent = file.getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ByteArrayResource fileResource = new ByteArrayResource(fileContent) {
            @Override
            public String getFilename() {
                return file.getOriginalFilename();
            }
        };

        String response = webClient.post()
                .uri(apiUrl)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .body(BodyInserters.fromMultipartData("file", fileResource))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        Gson gson = new Gson();
        ResponseFile responseFile = gson.fromJson(response, ResponseFile.class);
        System.out.println(responseFile.getFiles().get(responseFile.getFiles().size()-1));
    }
*/
}
