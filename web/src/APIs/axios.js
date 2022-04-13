import axios from 'axios';

const instance = axios.create({
  baseURL: 'https://kr.api.riotgames.com',
  params: {
    api_key: 'RGAPI-135ebda6-ff01-4545-a743-176291f12b33',
  },
});

export default instance;