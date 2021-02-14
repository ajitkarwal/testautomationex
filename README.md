# testAutomation


Open Terminal
## Download and setup maven
1. Download Maven (Reference https://maven.apache.org/install.html)

```wget https://apache.mirror.digitalpacific.com.au/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip```

2. Unzip

```unzip apache-maven-3.6.3-bin.zip```

3. Add the bin directory of the created directory apache-maven-3.6.3 to the PATH environment variable

```vi ~/.bash_profile (or .zshrc)```
```export PATH=~/apache-maven-3.6.3/bin:$PATH```

## Setup Project

4. Clone the project

```git clone https://github.com/karwal/testAutomation.git

cd testAutomation

xattr -d com.apple.quarantine chromedriver```

## Import the project into IntelliJ
