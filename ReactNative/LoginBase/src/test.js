/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
} from 'react-native';
import { 
  Container,
  Header,
  Body,
  Button,
  Icon,
  Title,
  Left,
  Right,
  Content,
  Footer,
  FooterTab,
} from 'native-base';

export default class Main extends Component {
  render() {
    return (
      <Container>
        <Header >
          <Left> 
            <Button iconLeft light>
              <Icon name='arrow-back' />
              <Text>Back</Text>
            </Button>
          </Left>

          <Content padder>
            <Text>
              This is Content Section
            </Text>
          </Content>

        </Header>
        <Button block info>
              <Text>Đăng nhập</Text>
            </Button>
        <Body>
      
            <Title style={{color:'red'}}>Hello World</Title>
            <Button full info>
              <Text>Đăng nhập</Text>
            </Button>
            <Button iconLeft>
              <Icon name='home'/>
              <Text>Home</Text>
            </Button>
      
        </Body>
      

        <Footer>
          <FooterTab>
            <Button success>
              <Title>Footer</Title>
            </Button>
          </FooterTab>
        </Footer>
      </Container>
    );
  }
}

