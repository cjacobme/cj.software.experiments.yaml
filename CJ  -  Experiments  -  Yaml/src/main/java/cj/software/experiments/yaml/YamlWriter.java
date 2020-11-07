package cj.software.experiments.yaml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YamlWriter
{
	public static void main(String[] args) throws JsonGenerationException,
			JsonMappingException,
			IOException
	{
		YamlWriter writer = new YamlWriter();
		writer.write();
	}

	private void write() throws JsonGenerationException, JsonMappingException, IOException
	{

		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		Company company = new Company();
		company.setName("Berlin Recycling Volleys");
		company.setFoundedYear(1992);
		// objectMapper.writeValue(System.out, company);
		//
		// objectMapper = new ObjectMapper(new YAMLFactory());
		Human human = new Human();
		human.setName("Grankin");
		human.setFirstName("Sergej");
		// objectMapper.writeValue(System.out, human);
		//
		// objectMapper = new ObjectMapper(new YAMLFactory());
		List<Person> list = new ArrayList<>();
		list.add(company);
		list.add(human);
		objectMapper.writeValue(System.out, list);
	}
}
