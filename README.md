1. mvn -DskipTests --no-transfer-progress clean package -Pnative
2. ./target/lombok = fail

Error:
Caused by: com.fasterxml.jackson.databind.exc.InvalidDefinitionException: 
Builder class `com.example.lombok.dto.PullRequestConfig$PullRequestConfigBuilderImpl` 
does not have build method (name: 'build')
