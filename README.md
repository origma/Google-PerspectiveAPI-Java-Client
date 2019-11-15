# Google-PerspectiveAPI-Java-Client
A Java client for Google's PerspectiveAPI

## Usage
First create a new PerspectiveAPI instance:
```java
PerspectiveAPI pAPI = PerspectiveAPI.create(key);
```
Then build an analysis request using the builder:
```java
pAPI.analyze(new AnalyzeCommentRequest.Builder()
		.addRequestedAttribute(AttributeType.TOXICITY, null)
		.comment(new Entry.Builder()
				.type(ContentType.PLAIN_TEXT)
				.text(comment)
				.build())
		.build());
```
or do a simple request
```java
pAPI.analyze(comment);
```

To understand the models and their functions, see https://github.com/conversationai/perspectiveapi/blob/master/2-api/models.md and https://github.com/conversationai/perspectiveapi/blob/master/2-api/methods.md

## Maven
```
<dependency>
  <groupId>com.github.origma</groupId>
  <artifactId>Google-PerspectiveAPI-Java-Client</artifactId>
  <version>0.0.5</version>
</dependency>
```
...

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

## See Also
* [Google API Reference](https://github.com/conversationai/perspectiveapi/tree/master/2-api)
* [JavaDoc](https://origma.com.au/docs/perspectiveapi)
