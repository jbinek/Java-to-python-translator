## Build

```
gradlew fatJar
```

## Run

```
java -cp build/libs/antlr-java-ast-example-all.jar AstTreeGenerator
```

## Fat jar task
Produces a JAR containing all the dependencies.


## Methods

1. *readfile()*

Reads specified file and then *String(byte[] bytes, String charsetName)* constructs and returns a new String by decoding the specified array of bytes using the specified charset.

2. *parseJava()*

Tworzony jest lexer na podstawie sparsowanego do formatu "ANTLRInputStream" kodu. Następnie z lexera generowane są tokeny. Z tokenów towrzony jest parser.

Zwracane jest *ParserRuleContext* -  A rule invocation record for parsing. Contains all of the information about the current rule not stored in the RuleContext. It handles parse tree children list, Any ATN state tracing, and the default values available for rule invocations: start, stop, rule index, current alt number.


3. *explore()*

Flaga *toBeIgnored* - sprawdza, czy sprawdzany node nie jest liściem (jeśli getChildCount zwróci > 1 tzn. że nie jest liściem), czy ustawiony jest tryb szczegółowy (verbose) i sprawdza popraność formatu

Następnie printowane są odpowiednie rule z Parsera z wcięciami (ogólnie drzewo).

4. *print()*

Po prostu printuje drzewo.


## Wnioski z "eksperymentów" z gramatyką

1. Próba zepsucia symbolu ":"

```
syntax error: '::' came as a complete surprise to me while matching rule preamble
```

2. Napisanie *forr* zamiast *for* przy basicForStatement nie spowodowało żadnego błędu

3. Wpisanie dwukrotnie 'char' w integralTypes również nie spowodowało błędu:

```
integralType
	:	'byte'
	|	'short'
	|	'int'
	|	'long'
	|	'char'
	|       'char'
	;
```