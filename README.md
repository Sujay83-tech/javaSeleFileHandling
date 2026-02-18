# 📁 Java File Handling Practice Workspace

A comprehensive collection of Java projects demonstrating file handling operations including JSON, XML, CSV, and general file/folder manipulation.

[![Java](https://img.shields.io/badge/Java-11%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

---

## 📚 Table of Contents

- [Overview](#overview)
- [Projects Included](#projects-included)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Descriptions](#project-descriptions)
- [Code Examples](#code-examples)
- [Setup Instructions](#setup-instructions)
- [Learning Resources](#learning-resources)
- [Author](#author)

---

## 🎯 Overview

This workspace contains practical examples of file handling in Java, covering:

- ✅ **JSON** - Reading and writing JSON data using Jackson & GSON
- ✅ **XML** - Parsing and creating XML files
- ✅ **CSV** - Processing CSV files with data manipulation
- ✅ **File Operations** - Creating, reading, writing, deleting files
- ✅ **Folder Operations** - Directory creation, listing, and management

Perfect for beginners learning Java I/O operations and working with different file formats!

---

## 📦 Projects Included

### 1. 📄 JSON File Handling
**Location:** `JSONPractice/`

Learn how to work with JSON data using popular libraries:
- Parse JSON files into Java objects
- Convert Java objects to JSON
- Handle nested JSON structures
- Work with JSON arrays

**Libraries Used:**
- Jackson (FasterXML)
- GSON (Google)

---

### 2. 🗂️ XML File Handling
**Location:** `XMLPractice/`

Master XML processing in Java:
- Read and parse XML documents
- Create XML files programmatically
- Navigate XML structure using DOM/SAX
- XML validation and transformation

**Libraries Used:**
- DOM Parser
- SAX Parser
- JAXB (optional)

---

### 3. 📊 CSV File Handling
**Location:** `CSVPractice/`

Work with CSV data efficiently:
- Read CSV files into data structures
- Write data to CSV format
- Handle large CSV files
- Parse complex CSV with special characters

**Libraries Used:**
- OpenCSV
- Apache Commons CSV
- Custom parsers

---

### 4. 📂 File Operations
**Location:** `FileHandling/`

Comprehensive file manipulation:
- Create, read, update, delete files
- File copying and moving
- Reading text files line by line
- Writing data to files
- File metadata operations

**Topics Covered:**
- FileReader/FileWriter
- BufferedReader/BufferedWriter
- FileInputStream/FileOutputStream
- Files class (Java NIO)

---

### 5. 🗄️ Folder Operations
**Location:** `FolderHandling/`

Directory management examples:
- Create directories and subdirectories
- List files in a directory
- Recursive folder traversal
- Delete directories
- Check folder permissions

**Topics Covered:**
- File class methods
- Path and Paths classes
- Directory streams
- File tree walking

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 11+ | Core programming language |
| **Jackson** | 2.15.2 | JSON processing |
| **GSON** | 2.10.1 | JSON serialization/deserialization |
| **OpenCSV** | 5.7.1 | CSV parsing |
| **Apache Commons CSV** | 1.10.0 | CSV utilities |
| **DOM/SAX Parser** | Built-in | XML processing |

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 11 or higher
- **IDE:** Eclipse, IntelliJ IDEA, or VS Code
- **Maven** (optional, for dependency management)

### Quick Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Sujay3-tech/javaSeleFileHandling.git
   cd javaSeleFileHandling
   ```

2. **Import into your IDE:**
   - **Eclipse:** File → Import → Existing Projects into Workspace
   - **IntelliJ:** File → Open → Select workspace folder
   - **VS Code:** File → Open Folder

3. **Add required libraries:**
   - Download JAR files from the links below
   - Add them to your project's build path

4. **Run examples:**
   - Navigate to any project's main class
   - Right-click → Run As → Java Application

---

## 📖 Project Descriptions

### JSON File Handling

#### **What You'll Learn:**
- Serialization (Object → JSON)
- Deserialization (JSON → Object)
- Working with nested objects
- Handling JSON arrays
- Error handling and validation

#### **Key Classes:**
```
JSONPractice/
├── src/
│   └── jsonFiles/
│       ├── ReadDataFromJSON.java    (Jackson example)
│       ├── ReadDataFromGSON.java    (GSON example)
│       ├── Person.java              (Model class)
│       └── Address.java             (Nested model)
└── data/
    └── emp.json                     (Sample JSON file)
```

#### **Sample JSON Structure:**
```json
{
  "firstname": "John",
  "lastname": "Doe",
  "address": [
    {
      "street": "123 Main Street",
      "city": "New York",
      "state": "NY"
    }
  ]
}
```

---

### XML File Handling

#### **What You'll Learn:**
- DOM parsing (load entire XML into memory)
- SAX parsing (event-based, memory efficient)
- Creating XML documents programmatically
- XPath queries
- XML validation against schema

#### **Key Classes:**
```
XMLPractice/
├── src/
│   └── xmlFiles/
│       ├── ReadXMLWithDOM.java
│       ├── ReadXMLWithSAX.java
│       ├── CreateXML.java
│       └── Employee.java
└── data/
    └── employees.xml
```

#### **Sample XML Structure:**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<employees>
    <employee id="1">
        <name>John Doe</name>
        <department>IT</department>
        <salary>75000</salary>
    </employee>
</employees>
```

---

### CSV File Handling

#### **What You'll Learn:**
- Reading CSV files
- Writing data to CSV
- Handling headers
- Dealing with special characters (commas, quotes)
- Batch processing large files

#### **Key Classes:**
```
CSVPractice/
├── src/
│   └── csvFiles/
│       ├── ReadCSV.java
│       ├── WriteCSV.java
│       ├── CSVParser.java
│       └── Student.java
└── data/
    └── students.csv
```

#### **Sample CSV Structure:**
```csv
ID,Name,Age,Grade,Email
1,John Doe,20,A,john@example.com
2,Jane Smith,22,B,jane@example.com
```

---

### File Operations

#### **What You'll Learn:**
- Creating new files
- Reading file content (entire file, line by line)
- Writing to files (overwrite, append)
- Copying and moving files
- Deleting files
- Checking file properties (size, last modified, permissions)

#### **Key Classes:**
```
FileHandling/
└── src/
    └── fileOps/
        ├── CreateFile.java
        ├── ReadFile.java
        ├── WriteFile.java
        ├── CopyFile.java
        ├── DeleteFile.java
        └── FileProperties.java
```

#### **Common Operations:**
- **Create:** `File.createNewFile()`
- **Read:** `BufferedReader`, `Files.readAllLines()`
- **Write:** `FileWriter`, `BufferedWriter`
- **Delete:** `File.delete()`, `Files.delete()`

---

### Folder Operations

#### **What You'll Learn:**
- Creating single and nested directories
- Listing files in a directory
- Recursive folder traversal
- Filtering files by extension
- Deleting directories (empty and non-empty)
- Moving/renaming directories

#### **Key Classes:**
```
FolderHandling/
└── src/
    └── folderOps/
        ├── CreateFolder.java
        ├── ListFiles.java
        ├── RecursiveTraversal.java
        ├── DeleteFolder.java
        └── FolderInfo.java
```

#### **Common Operations:**
- **Create:** `File.mkdir()`, `File.mkdirs()`
- **List:** `File.listFiles()`, `Files.list()`
- **Traverse:** `Files.walk()`, recursive methods
- **Delete:** `File.delete()`, `Files.delete()`

---

## 💻 Code Examples

### Example 1: Reading JSON with Jackson

```java
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("data/emp.json");
            
            Person person = mapper.readValue(file, Person.class);
            
            System.out.println("Name: " + person.getFirstname());
            System.out.println("Last: " + person.getLastname());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

### Example 2: Writing CSV File

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.csv")) {
            // Write header
            writer.append("ID,Name,Age\n");
            
            // Write data
            writer.append("1,John Doe,25\n");
            writer.append("2,Jane Smith,30\n");
            
            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### Example 3: Creating Directory Structure

```java
import java.io.File;

public class CreateFolderStructure {
    public static void main(String[] args) {
        // Create nested directories
        File folder = new File("data/reports/2024/january");
        
        if (folder.mkdirs()) {
            System.out.println("Folder structure created!");
        } else {
            System.out.println("Failed to create folders.");
        }
    }
}
```

---

### Example 4: Reading File Line by Line

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("data/sample.txt"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### Example 5: Parsing XML with DOM

```java
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.File;

public class ParseXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("data/employees.xml"));
            
            NodeList nodeList = doc.getElementsByTagName("employee");
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String name = element.getElementsByTagName("name")
                    .item(0).getTextContent();
                System.out.println("Employee: " + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📥 Setup Instructions

### Step 1: Download Required Libraries

#### **For JSON (Jackson):**
Download these JAR files from [Maven Central](https://mvnrepository.com/):
- `jackson-databind-2.15.2.jar`
- `jackson-core-2.15.2.jar`
- `jackson-annotations-2.15.2.jar`

#### **For JSON (GSON):**
- `gson-2.10.1.jar`

#### **For CSV:**
- `opencsv-5.7.1.jar`
- `commons-csv-1.10.0.jar`

---

### Step 2: Add Libraries to Build Path

#### **Eclipse:**
1. Right-click project → **Build Path** → **Configure Build Path**
2. **Libraries** tab → **Add External JARs**
3. Select downloaded JAR files → **Apply and Close**

#### **IntelliJ IDEA:**
1. **File** → **Project Structure** → **Libraries**
2. Click **+** → **Java** → Select JAR files → **OK**

#### **VS Code:**
1. Create `lib/` folder in project root
2. Copy JAR files into `lib/`
3. Update `.classpath` or `settings.json` to include JARs

---

### Step 3: Maven Configuration (Alternative)

If using Maven, add to `pom.xml`:

```xml
<dependencies>
    <!-- Jackson -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.15.2</version>
    </dependency>
    
    <!-- GSON -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
    
    <!-- OpenCSV -->
    <dependency>
        <groupId>com.opencsv</groupId>
        <artifactId>opencsv</artifactId>
        <version>5.7.1</version>
    </dependency>
    
    <!-- Apache Commons CSV -->
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-csv</artifactId>
        <version>1.10.0</version>
    </dependency>
</dependencies>
```

---

## 🎓 Learning Resources

### Official Documentation
- [Java I/O Tutorial](https://docs.oracle.com/javase/tutorial/essential/io/)
- [Jackson Documentation](https://github.com/FasterXML/jackson-docs)
- [GSON User Guide](https://github.com/google/gson/blob/master/UserGuide.md)
- [OpenCSV Documentation](http://opencsv.sourceforge.net/)

### Tutorials
- [Java File Handling - W3Schools](https://www.w3schools.com/java/java_files.asp)
- [JSON in Java - Baeldung](https://www.baeldung.com/java-json)
- [XML Parsing in Java - GeeksforGeeks](https://www.geeksforgeeks.org/xml-parsing-java/)

### Video Resources
- [Java File I/O - Programming with Mosh](https://www.youtube.com/watch?v=ScUJx4aWRi0)
- [Working with JSON in Java - Amigoscode](https://www.youtube.com/watch?v=BqR1d3Yw08A)

---

## 🤝 Contributing

Contributions are welcome! If you have improvements or new examples:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-example`)
3. Commit your changes (`git commit -m 'Add CSV filtering example'`)
4. Push to the branch (`git push origin feature/new-example`)
5. Open a Pull Request

---

## 📝 Best Practices Demonstrated

✅ **Exception Handling** - All file operations wrapped in try-catch  
✅ **Resource Management** - Using try-with-resources for auto-closing  
✅ **Null Checks** - Validating objects before use  
✅ **Clean Code** - Meaningful variable names and comments  
✅ **Separation of Concerns** - Model classes separate from logic  
✅ **Error Messages** - Descriptive error logging  

---

## 🐛 Troubleshooting

### Common Issues

**Issue 1: FileNotFoundException**
```
Solution: Check file path is correct and file exists
Use absolute path for testing: "C:/path/to/file.json"
```

**Issue 2: ClassNotFoundException for Jackson/GSON**
```
Solution: Ensure JAR files are added to build path
Verify in Project Properties → Java Build Path → Libraries
```

**Issue 3: JSON Parsing Error**
```
Solution: Validate JSON at jsonlint.com
Check field names match Java class exactly
```

**Issue 4: CSV Special Characters**
```
Solution: Use proper encoding (UTF-8)
Handle quotes and commas with library parsers
```

---

## 📊 Project Structure

```
javaSeleFileHandling/
│
├── JSONPractice/
│   ├── src/
│   │   └── jsonFiles/
│   │       ├── ReadDataFromJSON.java
│   │       ├── ReadDataFromGSON.java
│   │       ├── Person.java
│   │       └── Address.java
│   └── data/
│       └── emp.json
│
├── XMLPractice/
│   ├── src/
│   │   └── xmlFiles/
│   │       ├── ReadXMLWithDOM.java
│   │       ├── CreateXML.java
│   │       └── Employee.java
│   └── data/
│       └── employees.xml
│
├── CSVPractice/
│   ├── src/
│   │   └── csvFiles/
│   │       ├── ReadCSV.java
│   │       ├── WriteCSV.java
│   │       └── Student.java
│   └── data/
│       └── students.csv
│
├── FileHandling/
│   └── src/
│       └── fileOps/
│           ├── CreateFile.java
│           ├── ReadFile.java
│           ├── WriteFile.java
│           └── DeleteFile.java
│
├── FolderHandling/
│   └── src/
│       └── folderOps/
│           ├── CreateFolder.java
│           ├── ListFiles.java
│           └── DeleteFolder.java
│
├── lib/
│   ├── jackson-databind-2.15.2.jar
│   ├── gson-2.10.1.jar
│   └── opencsv-5.7.1.jar
│
└── README.md
```

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Sujay**
- GitHub: [@Sujay3-tech](https://github.com/Sujay3-tech)
- Repository: [javaSeleFileHandling](https://github.com/Sujay3-tech/javaSeleFileHandling)

---

## 🌟 Acknowledgments

- Jackson library by FasterXML
- GSON library by Google
- OpenCSV community
- Java documentation and tutorials
- Stack Overflow community

---

## 📈 Future Enhancements

- [ ] Add unit tests with JUnit
- [ ] Add Excel file handling (Apache POI)
- [ ] Add PDF reading/writing examples
- [ ] Add file compression examples (ZIP)
- [ ] Add file encryption/decryption examples
- [ ] Add streaming for large files
- [ ] Add REST API integration examples

---

## 🎯 Learning Path

**Beginner** → Start with File Operations  
**Intermediate** → Move to JSON and CSV  
**Advanced** → Tackle XML and complex parsing  

Each project builds upon fundamental concepts, so follow the progression for best results!

---

**Happy Coding! 🚀**

If you find this workspace helpful, please ⭐ star the repository!
