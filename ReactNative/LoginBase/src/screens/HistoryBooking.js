import React, { Component } from 'react';
import {View, Text, StyleSheet, TouchableOpacity, Alert} from 'react-native';
import {Container, Header, Body, Left, Icon, List, ListItem,Content,Thumbnail, Right} from 'native-base';
export interface Props {
    navigation: any,
    data: any,
}
export interface State {}
export default class HistoryBooking extends Component<Props, State> {
    constructor(props) {
        super(props);
        this.state = {
            index: 0
        }
    }

    taoHang(property) {
        this.state.index++;
        var status = property.status;
        var background, strStatus;
        if(status === 0) {
            background = "#00A652";
            strStatus = "Chờ xác nhận"
        } else if(status === 1) {
            background = "#b7640b";
            strStatus = "BS xác nhận"
        } else if(status === 2) {
            background = "#00A652";
            strStatus = "Hoàn thành";
        } else if(status === 3) {
            background = "#FF0101";
            strStatus = "Đã hủy";
        }
        return(
            
            <TouchableOpacity avatar style={{paddingBottom: 10, paddingTop: 5, paddingHorizontal: 5, flexDirection: 'row', backgroundColor: (this.state.index%2==0) ? '#FFFFFF' : '#F9F9F9'}}>
                <Left style={{flexDirection: 'row'}}>
                    <Thumbnail source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBpivPCRNtpeON4SM3cKFV5P1fG2bLoA_f9InGKZGArYNolFXIeQ' }} />
                    <View style={{padding: 10}}>
                        <Text style={{fontSize: 17, color: 'black'}} >{property.docter_name}</Text>
                        <Text note>null</Text>
                    </View>
                </Left>
                <Right>
                    <Text style={{color:'white', fontSize: 15, backgroundColor: background}}>{strStatus}</Text>
                    <Text note>null</Text>
                </Right>
            </TouchableOpacity>
        )
    }
  render() {
    return (
      <Container style={{flex: 1}}>
        <Header style={styles.header} androidStatusBarColor='#00A652' backgroundColor='#00A652'>
            <Body style={{flexDirection: 'row'}}>
                <TouchableOpacity>
                    <Icon name="arrow-back" style={{color: 'white'}}/>
                </TouchableOpacity>
                <Text style={{color: 'white', fontSize:20, }}>  Lich su dat</Text>        
            </Body>
        </Header>

        <View style={{flex: 1}}>
            <List
                dataArray = {this.props.data}
                renderRow= {this.taoHang.bind(this)}
                
            ></List>
        </View>
      </Container>
    )
  }
};

const styles = StyleSheet.create({
    header: {
       
    },
    body: {
        flex: 1,
       
    }
});