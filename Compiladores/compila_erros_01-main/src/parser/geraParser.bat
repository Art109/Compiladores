#  -package parser , comando para setar o pacote do parser criado
#  -parser Parser , comando para alterar o nome do parser criado. Por default ele usa parser com a primeira minuscula e isso não é legal.

java -jar ../../lib/java-cup-11a.jar -package parser -parser Parser expr.cup
jflex ../scanner/Scanner.flex