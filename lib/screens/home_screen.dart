import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  final String email;
  final String role;

  const HomeScreen({Key? key, required this.email, required this.role})
    : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Home')),
      body: Center(child: Text('Welcome $email ($role)')),
    );
  }
}
