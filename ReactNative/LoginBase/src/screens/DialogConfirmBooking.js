import { Text,Container, Header,Thumbnail, Content, Card, CardItem,Item, Body,Input,Button,Label, Left  } from 'native-base';
import React, { Component } from 'react';
import {View ,TouchableOpacity, StyleSheet } from 'react-native';
import Icon from 'react-native-vector-icons/FontAwesome';
export interface Props {

}
export default class DialogConfirmBooking extends Component<Props> {
    render() {
        return (
          
                <Container style={styles.container}>
                    <Header style= {styles.header} androidStatusBarColor='#00aa8d' backgroundColor='#00aa8d'>
                        
                            <Thumbnail
                                style={{backgroundColor: '#00aa8d', position: 'absolute', left: 10}}
                                source= {{uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBpivPCRNtpeON4SM3cKFV5P1fG2bLoA_f9InGKZGArYNolFXIeQ' }}
                            />
                            <Body style={styles.bodyHeader}>
                                <Text style={{color: 'white',fontWeight: '600'}}>NHÂN VIÊN: </Text>
                                <Text style={{color: 'white'}}>Thành tiền: </Text>
                            </Body>

                    </Header>

                    <View style= {styles.body}>
                        <Item regular style={{flexDirection:'row', paddingTop: 20, paddingHorizontal: 20}}>
                            <Input placeholder=' ' style={{flex: 1,backgroundColor: 'white',borderColor: 'grey', borderWidth: 1}} />
                        </Item>
                        <Item regular style={{ paddingTop: 20, flexDirection: 'row', paddingHorizontal: 20}}>
                            <Input placeholder=' ' style={{backgroundColor: 'white',flex: 3/10,borderColor: 'grey', borderWidth: 1}} />
                            <Text> </Text>
                            <Input placeholder=' ' style={{backgroundColor: 'white',flex: 7/10,borderColor: 'grey', borderWidth: 1}} />
                        </Item>
                        <View style={{flexDirection: 'row', justifyContent: 'center', paddingTop: 10}}>
                            <Button style={{flex: 3/10, justifyContent: 'center', backgroundColor: '#5B5B5B'}}><Text>HUY</Text></Button>
                            <Text>   </Text>
                            
                            <Button style={{flex: 3/10, justifyContent: 'center', backgroundColor: '#00aa8d'}}><Text>Dat Lich</Text></Button>
                        </View>
                    </View>
                    
                </Container>
           
        )
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: 'white',
    },
    header: {
        height: 70,
        flexDirection: 'column',
    },
    bodyHeader: { justifyContent: 'center', marginRight: 100, },
    body:{flex: 4/10, backgroundColor: '#EAEAEA'}
})