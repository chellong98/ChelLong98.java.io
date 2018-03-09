import React, { Component } from 'react';
import {
    View,
    Text,
    StyleSheet,
} from 'react-native';
import {Container, Header, Body, Title, Icon, Left, Button} from 'native-base';
export default class Home extends Component {
  back() {
    this.props.navigation.navigate('Login');
  }
  render() {
    return (
        <Container>
          <Header>
            <Left>
              <Button iconLeft transparent onPress={()=>this.back()}>
                <Icon name= 'arrow-back'/>
              </Button>
            </Left>
            <Body>
              <Title><Icon name='home' style={{color: 'white'}}/>   Home</Title>
            </Body>
          </Header>
        </Container>
    )
  }
};
