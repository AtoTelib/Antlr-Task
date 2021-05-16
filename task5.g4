grammar task5;

start: (((Output1)) | ((Output2))) + EOF;

Output1: (O|O((Z|O(O*)Z)Z)*((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)*(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)*(Z|O(O*)Z)O)*(O|O((Z|O(O*)Z)Z)*((Z|O(O*)Z)Z))) {System.out.print("00");} ;

Output2: ((O|(Z|O((Z|O(O*)Z)Z)*(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)*(Z|O(O*)Z)O)*O)((Z|O(O*)Z)Z)*(O|O(O*)(O)))  {System.out.print("11");};

Output_1: O|O((Z|O(O*)Z)Z)((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(O|O((Z|O(O*)Z)Z)*((Z|O(O*)Z)Z));

Output_2: O|O((Z|O(O*)Z)Z)((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(O((Z|O(O*)Z)Z)*((Z|O(O*)Z)Z));

Output_3: O|O((Z|O(O*)Z)Z)((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(O((Z|O(O*)Z)Z)*);

Output_4: O|O(Z|O(O*)Z)Z((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(O((Z|O(O*)Z)Z)*);

Output_5: O|O(Z|O(O*)Z)Z((Z|O(O*)Z)Z)|(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)O((Z|O(O*)Z)Z)*;

Output_6: O|O(Z|O(O*)Z)Z((Z|O(O*)Z)Z)|(Z|O(Z|O(O*)Z)Z(Z|O(O*)Z)O)(Z|O((Z|O(O*)Z)Z)(Z|O(O*)Z)O)O((Z|O(O*)Z)Z)*;

Output_7: O|O(Z|O(O*)Z)Z((Z|O(O*)Z)Z)|(Z|O(Z|O(O*)Z)Z(Z|O(O*)Z)O)(Z|O(Z|O(O*)Z)Z(Z|O(O*)Z)O)O((Z|O(O*)Z)Z)*;

fragment Z: '0';
fragment O: '1';

