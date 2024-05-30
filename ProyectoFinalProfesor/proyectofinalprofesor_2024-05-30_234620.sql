--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1
-- Dumped by pg_dump version 16.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: empleados_temporales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empleados_temporales (
    identificador integer NOT NULL,
    nombre character varying(255),
    apellido character varying(255),
    salario double precision
);


ALTER TABLE public.empleados_temporales OWNER TO postgres;

--
-- Name: empleados_temporales_identificador_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.empleados_temporales_identificador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.empleados_temporales_identificador_seq OWNER TO postgres;

--
-- Name: empleados_temporales_identificador_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.empleados_temporales_identificador_seq OWNED BY public.empleados_temporales.identificador;


--
-- Name: empleados_temporales identificador; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empleados_temporales ALTER COLUMN identificador SET DEFAULT nextval('public.empleados_temporales_identificador_seq'::regclass);


--
-- Data for Name: empleados_temporales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empleados_temporales (identificador, nombre, apellido, salario) FROM stdin;
1	Jesse	Pinkman	7000000
2	Walter	White	57000000
3	Hank	Schrader	3500
\.


--
-- Name: empleados_temporales_identificador_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.empleados_temporales_identificador_seq', 3, true);


--
-- Name: empleados_temporales empleados_temporales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empleados_temporales
    ADD CONSTRAINT empleados_temporales_pkey PRIMARY KEY (identificador);


--
-- PostgreSQL database dump complete
--

