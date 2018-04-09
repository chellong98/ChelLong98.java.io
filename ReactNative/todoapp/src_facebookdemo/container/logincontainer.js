import React, { Component } from 'react';
import LoginScreen from './../screens/loginscreen';
export interface Props {
  navigation: any,
}
export default class logincontainer extends Component<Props> {
  render() {
    return (  
      <LoginScreen/>
    )
  }
};
