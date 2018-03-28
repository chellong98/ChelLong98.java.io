import React, { Component } from 'react';
import {
    View,
    Text,
    StyleSheet,
    ListView,
    Alert,
    TouchableOpacity,
} from 'react-native';
import {Container, Header, Body, Title, Icon, Left, Button, Form, Input, Content, Item, Label, List, ListItem} from 'native-base';

export interface Props {
  navigation: any,
  data: any,
  back: Function,
}
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
 
  
  taoHang(property) {
    return( 
    
      <ListItem onPress={()=> Alert.alert(property.title)} button  style={{paddingBottom: 10, borderBottomWidth: 1}}>
        <Left style={{flex: 2/10}}>
          <Icon name='person'/>
        </Left>
        <Body>
          <Text>{property.title}</Text>
        </Body>
     </ListItem>
   
    )
  }
 
  render() {
    return (
        <Container>

          <Header>
            <Left>
              <Button iconLeft transparent onPress={()=>this.props.back()}>
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
            
            <List 
            dataArray={this.props.data} //da sua
            renderRow={this.taoHang.bind(this)}
            >
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