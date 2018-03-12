import React, { Component } from 'react';
import {
    View,
    Text,
    StyleSheet,
    ListView,
    Alert,
} from 'react-native';
import {Container, Header, Body, Title, Icon, Left, Button, Form, Input, Content, Item, Label, List, ListItem} from 'native-base';
const URL_API = 'https://facebook.github.io/react-native/movies.json';
// var list = [
//   {
//   title: "Star Wars",
//   releaseYear: "1977"
//   },
//   {
//   title: "Back to the Future",
//   releaseYear: "1985"
//   },
//   {
//   title: "The Matrix",
//   releaseYear: "1999"
//   },
//   {
//   title: "Inception",
//   releaseYear: "2010"
//   },
//   {
//   title: "Interstellar",
//   releaseYear: "2014"
//   }
// ];
export default class Home extends Component { 
  constructor(props) {
    super(props);
    console.log('hello');
    // var ds = new ListView.DataSource({rowHasChanged: (r1,r2)=>r1!==r2});
    this.state = {
      // dataSource : ds.cloneWithRows(list),
      list : []
    }
  }
  back() {
    this.props.navigation.navigate('Login');
  }
   getRequest() {
    // Alert.alert('hello');
    fetch(URL_API, {
      method: "GET",
      headers: {
        'Content-type':'application/json'
      }
    }).then(response => response.json()
      ).then(responseData => {
        // Alert.alert(responseData.movies+"");
        this.setState ({
          list : responseData.movies
        }); 
        // Alert.alert(list+"");
        // this.setState = {
        //   dataSource : this.state.dataSource.cloneWithRows(list)
        // }
      }).done()
  }
  taoHang(property) {
    return(
      
        <Text>{property.title}</Text>
     
    )
  }
  componentDidMount () {
    this.getRequest();
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

          <Content style={styles.container}>
            <Form>
              <Item floatingLabel>
                <Label>Username</Label>
                <Input/>
              </Item>
            </Form>
  
            <List dataArray={this.state.list}
            renderRow={(item) =>
              <ListItem>
                <Text>{item.title}</Text>
              </ListItem>
            }>
            </List>
          </Content>
        </Container>
    )
  }
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  }
});