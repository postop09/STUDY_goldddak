import React, { useEffect, useState } from 'react'
import axios from 'axios';

export default function DataList() {
  const [userData, setUserData] = useState([]);
  const [puuId, setPuuId] = useState([]);
  const [match, setMatch] = useState([]);
  const urlKr = 'https://kr.api.riotgames.com';
  const apiKey = 'RGAPI-b2b09bb7-6c7e-41db-9298-4ec3bd493600';

  // 소환사 이름
  async function fetchUserData() {
    const res = await axios.get(`${urlKr}/lol/league/v4/entries/RANKED_SOLO_5x5/GOLD/I`, {
      params: {
        api_key: apiKey
      }
    })
    const resG1 = res.data.slice(0, 10);
    resG1.map((data) => {
      setUserData((prev) => [...prev, data.summonerName]);
    })
  };
  // puuid
  async function fetchPuuid() {
    for (let i = 0; i < userData.length; i++) {
      const res = await axios.get(`${urlKr}/lol/summoner/v4/summoners/by-name/${userData[i]}`, {
        params: {
          api_key: apiKey
        }
      })
      setPuuId((prev) => [...prev, res.data.puuid]);
      console.log(res);
    }
  }
  // // matchId
  async function fetchMatchId() {
    for (let i = 0; i < puuId.length; i++) {
      const res = await axios.get(`https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/${puuId[i]}/ids?start=0&count=2`, {
        params: {
          api_key: apiKey
        }
      })
      setMatch((prev) => [...prev, res.data])
      console.log(res);
    }
  }
  useEffect(() => {
    fetchUserData();
  }, [])
  
  return (
    <div>
      {match.map((data) => {
        return (
          <li>{data}</li>
        )
      })}
    </div>
  )
}
