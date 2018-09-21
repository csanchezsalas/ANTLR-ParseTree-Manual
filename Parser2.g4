parser grammar Parser2;

options {
  tokenVocab = Scanner;
}

program : singleCommand EOF                                   #programAST ;
commandAST : singleCommand (PyCOMA singleCommand)*               #command ;
singleCommand : ID   ASSIGN expression                        #assignSCAST
                     | PIZQ expression PDER                   #funCallSCAST
        | IF expression THEN singleCommand
                        ELSE singleCommand                    #ifSCAST
        | WHILE expression DO singleCommand                   #whileSCAST
        | LET declaration IN singleCommand                    #letSCAST
        | BEGIN commandAST END                                   #blockSCAST ;
declaration  : singleDeclaration (PyCOMA singleDeclaration)*  #declarationAST;
singleDeclaration : CONST ID VIR expression                   #constDeclAST
    	   | VAR ID DOSPUN typedenoter                        #varDeclAST;
typedenoter : ID                                              #typedenoterAST;
expression : primaryExpression ((PLUS|MINUS|MULT|DIV) primaryExpression)*  #expressionAST;
primaryExpression :  NUM                                      #numPEAST
                    | ID                                      #idPEAST
                    | PIZQ expression PDER                    #groupPEAST ;
/* operator :  SUM                                               #sumOPAST
            | SUB                                             #subOPAST
            | MUL                                             #mulOPAST
            | DIV                                             #divOPAST; */


