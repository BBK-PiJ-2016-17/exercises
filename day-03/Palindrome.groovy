// Palindrome generator

print ("Your text here: ");

String phrase = System.console().readLine();

print phrase;

// Read and reverse

int howLong = phrase.length();

for (int i = 0; i < howLong; i++) {
	print phrase.charAt(howLong - i - 1);
}
println "";

print phrase;
for (i = howLong - 1; i >= 0; i--) {
	print phrase.charAt(i);
}
println "";

// Printing without the last character repeated
print phrase;
for (int i = 0; i < howLong - 1; i++) {
	print phrase.charAt(howLong - i - 1 - 1);
}
println "";

print phrase;
for (i = howLong - 1 - 1; i >= 0; i--) {
	print phrase.charAt(i);
}