import React, { useState } from 'react'
import axios from '../APIs/axios';
import requests from '../APIs/requests';

export default function Gold() {
  // summonerName
  const [userData, setUserData] = useState([]);
  async function fetchUserData() {
    const resG1 = await axios.get(requests.fetchG1Data);
    const summonersG1 = resG1.data.slice(0, 3);
    console.log('골드1', summonersG1);
    summonersG1.map((summoner) => {
      setUserData((prev) => [...prev, summoner.summonerName]);
    })
    const resG2 = await axios.get(requests.fetchG2Data);
    const summonersG2 = resG2.data.slice(0, 3);
    console.log('골드2', summonersG2);
    summonersG2.map((summoner) => {
      setUserData((prev) => [...prev, summoner.summonerName]);
    })
    const resG3 = await axios.get(requests.fetchG3Data);
    const summonersG3 = resG3.data.slice(0, 3);
    console.log('골드3', summonersG3);
    summonersG3.map((summoner) => {
      setUserData((prev) => [...prev, summoner.summonerName]);
    })
    const resG4 = await axios.get(requests.fetchG4Data);
    const summonersG4 = resG4.data.slice(0, 3);
    console.log('골드4', summonersG4);
    summonersG4.map((summoner) => {
      setUserData((prev) => [...prev, summoner.summonerName]);
    })
  }
  // puuId
  const [puuid, setPuuid] = useState([]);
  async function fetchPuuid() {
    console.log('소환사 이름 목록', userData);
    for (let i = 0; i < userData.length; i++) {
      const res = await axios.get(`/lol/summoner/v4/summoners/by-name/${userData[i]}`);
      // console.log(res.data);
      setPuuid((prev) => [...prev, res.data.puuid]);
    }
  }
  // matchId
  const [matchId, setMatchId] = useState([]);
  async function fetchMatchId() {
    console.log('소환사 puuId', puuid);
    for (let i = 0; i < puuid.length; i++) {
      const res = await axios.get(`https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/${puuid[i]}/ids?start=0&count=2`);
      // console.log(res.data);
      setMatchId((prev) => [...prev, ...res.data])
    }
  }
  // 
  const [gameRecord, setGameRecord] = useState([]);
  async function fetchGameRecord() {
    console.log('소환사 matchId', matchId);
    for (let i = 0; i < matchId.length; i++) {
      const res = await axios.get(`https://asia.api.riotgames.com/lol/match/v5/matches/${matchId[i]}`);
      const participants = res.data.info.participants;
      
      participants.map((participant) => {
        let totalData = {
          championName: participant.championName,
          kills: participant.kills,
          deaths: participant.deaths,
          assists: participant.assists,
          totalDamageDealtToChampions: participant.totalDamageDealtToChampions,
          win: participant.win
        }
        setGameRecord((prev) => [...prev, totalData])
      });
    }
  }

  const [Aatrox, setAatrox] = useState([]);
  function AatroxData() {
    gameRecord.map((data) => {
      if (data.championName === 'Aatrox') {
        setAatrox((prev) => [...prev, data])
      }
    })
  }
  return (
    <div>
      <button onClick={fetchUserData}>GET userData</button>
      <br />
      <button onClick={fetchPuuid}>GET puuId</button>
      <br />
      <button onClick={fetchMatchId}>GET matchId</button>
      <div>
        <button onClick={fetchGameRecord}>GET gameRecord</button>
        <button onClick={() => {console.log(gameRecord);}}>CHECK gameRecord</button>
      </div>
      <br />
      <div>
      <button onClick={AatroxData}>GET Aatrox</button>
      <button onClick={() => {console.log(Aatrox);}}>CHECK Aatrox</button>
      </div>
    </div>
  )
}
