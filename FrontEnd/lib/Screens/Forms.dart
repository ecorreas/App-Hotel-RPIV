import 'package:flutter/material.dart';

class Forms extends StatefulWidget {
  const Forms({
    Key key,
  }) : super(key: key);

  @override
  _FormsState createState() => _FormsState();
}

class _FormsState extends State<Forms> {
  String email = '';

  String password = '';

  @override
  Widget build(BuildContext context) {
    return Container(
      child: SingleChildScrollView(
        child: SizedBox(
          height: 200,
          child: Column(
            children: [
              TextField(
                onChanged: (text) {
                  email = text;
                },
                keyboardType: TextInputType.emailAddress,
                decoration: InputDecoration(
                  labelStyle: TextStyle(
                    color: Colors.white,
                  ),
                  labelText: 'Email',
                  enabledBorder: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.white),
                    borderRadius: BorderRadius.circular(10),
                  ),
                  focusedBorder: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.red),
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
              ),
              SizedBox(height: 15),
              TextField(
                onChanged: (text) {
                  password = text;
                },
                obscureText: true,
                decoration: InputDecoration(
                  labelStyle: TextStyle(
                    color: Colors.white,
                  ),
                  labelText: 'Password',
                  enabledBorder: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.white),
                    borderRadius: BorderRadius.circular(10),
                  ),
                  focusedBorder: OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.red),
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
              ),
              SizedBox(height: 15),
              RaisedButton(
                onPressed: () {
                  if (email == 'evandrosoares.aluno@unipampa.edu.br' &&
                      password == '12345678') {
                    Navigator.of(context).pushReplacementNamed('/home');
                  } else {
                    print('Login inválido');
                  }
                },
                child: Text('Entrar'),
              )
            ],
          ),
        ),
      ),
      alignment: Alignment.center,
    );
  }
}
