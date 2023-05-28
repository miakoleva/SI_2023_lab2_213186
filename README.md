Втора лабораториска вежба
Миа Колева 213186

Control Flow Graph
https://ibb.co/nQNB0Hx (кодот на методот function ни започнува од 44 линија)

Цикломатска комплексност:
Цикломатската комплексност е 11, ја добивам по формулата P+1, каде P е бројот на предикатни јазли.

Every Branch:
1. testFunctionWithValidUser() - се проверува дали успешно ќе се искреира валиден корисник
2. testFunctionWithNullUser() - доколку се испрати null user потребно е да се фрли exception
3. testFunctionWithNullPassword() - се фрла exception доколку на корисник се стави null пасворд
4. testFunctionWithNullEmail() - се фрла exception доколку на корисник се стави null емаил
5. testFunctionWithNullUsername() - се фрла exception доколку на корисник се стави null username
6. testFunctionWithExistingEmail() - ни враќа false доколку веќе постои корисник со постоечкиот емаил
7. testFunctionWithInvalidPasswordContainingUsername() - ни враќа false доколку сетираниот пасворд се содржи во корисничкото име на корисникот
8. testFunctionWithInvalidPasswordMissingSpecialCharacter() - ни враќа false доколку пасвордот не содржи ниту еден од потребните специјални карактери

 Multiple Condition:
1. testFunctionWithAllNonNullValues() - враќа true доколку сите аргументи пратени во конструкторот се валидни
2. testFunctionWithNullUserAndPassword() - се фрла exception доколку се обидеме да креираме корисник со null вредности за username и password
3. testFunctionWithNullUserAndEmail() - се фрла exception доколку се обидеме да креираме корисник со null вредности за username и email
4. testFunctionWithAllNullValues() - се фрла exception доколку се обидеме да креираме корисник со null вредности за username, password и email
